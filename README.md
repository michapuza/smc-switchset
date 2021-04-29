# smc-switchset
smc corporation manufactures ethernet/ip compatible valve bank units whose ip addresses are set by two banks of eight dip switches. this java source is intended to help determine those switch settings.

# what does it do?
i won't go into the details here, you can find that on smc's website. it's freely available. if you're viewing this repo, you probably know generally how the system works. you just don't want to do the math. i get it, i don't either. that's why i wrote the program.
basically, give it the third and fourth octets of your desired ip address and it'll tell you what to do with those eight switches. 

# what doesn't it do?
literally everything else. it's cut and dry and lightweight for a reason. it's just made to make life a little easier by way of doing less math.

# what should i do?
use it if you want. or, better yet, if you think you can improve it, please do! it's a crazy, crazy world out there and i wrote (and publically released!!!) a program in java. ask me if i'm doing okay. if you want to see more features, different formatting, or (please) the use of another language, fork it and do it. the world is your oyster and i'm just standing here pissing in the sand.

# can you show me?
sure. here's a simple case. imagine i want to set my valve bank to ip address 192.168.1.102. here's how that goes:

```
Input the third octet of the IP Address [0-1]: 1↵
Input the fourth octet of the IP Address [0-254]: 102↵
Settings1/Switch8 = 1

Settings2/Swtich8 = 0
Settings2/Switch7 = 1
Settings2/Switch6 = 1
Settings2/Switch5 = 0
Settings2/Switch4 = 0
Settings2/Switch3 = 1
Settings2/Switch2 = 1
Settings2/Switch1 = 0
Press any key to exit.↵

```
