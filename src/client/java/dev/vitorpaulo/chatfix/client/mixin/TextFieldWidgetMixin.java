package dev.vitorpaulo.chatfix.client.mixin;

import dev.vitorpaulo.chatfix.client.data.ChatDelayData;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TextFieldWidget.class)
public abstract class TextFieldWidgetMixin extends ClickableWidget {

    public TextFieldWidgetMixin(int x, int y, int width, int height, Text message) {
        super(x, y, width, height, message);
    }

    @Inject(method = "write", at = @At("HEAD"), cancellable = true)
    public void write(String text, CallbackInfo ci){
        long elapsed = System.currentTimeMillis() - ChatDelayData.chatOpenedAt;
        if (elapsed < 50) {
            ci.cancel();
        }
    }
}