# Learn Vim
### Delete a word
```
dw #in command mode
```
### Change in word
```
ciw 
```
### To copy(yank)
```
yy
```
### To delete a line
```
dd
```
### To select all
```
press v then shift + g
```
### To go on any line
```
:2 #colon then line number where you want to go
```
### To format
```
press '=' then shift + g
```
### Add line numbers
```
:set nu
```
# Substitution Command
### substitute a word
```
:%s/are/am/g
```
### Add something at the end of a sentence
```
:%s/$/?/g
```
### Delete everything after a word
```
:%s/How.*//g
```
### Add something in starting 
```
:%s/^/'/g
```
