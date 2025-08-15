# BlogChatFix 🗨️

**BlogChatFix** is a tiny Fabric client mod that fixes the annoying Linux chat bug ([MC-122477](https://bugs.mojang.com/browse/MC-122477)) where opening chat sometimes types `'t'` (or another key if rebound). It seems to happen only on Linux/GNU.

## How It Works ⚙️

The fix works by adding a small delay before allowing typing in chat. This prevents the first character from being accidentally typed when the chat opens.

## To-Do 📝

* Implement support to 1.13 <-> 1.18
* Make Mojang fix this

## Contributing 🤝

I’m not a mod developer, so **your help is welcome!**

* Want to fix bugs, improve code, or add features? Fork this repo, make your changes, and open a Pull Request.
* Any feedback or suggestions are super appreciated!