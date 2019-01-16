<h1 align="center">Conversations</h1>

<p align="center">Conversations: The very last word in instant messaging.</p>

<p align="center">
    <a href="https://conversations.im/j/conversations@conference.siacs.eu">
        <img src="https://inverse.chat/badge.svg?room=conversations@conference.siacs.eu"
             alt="chat on our conference room">
    </a>
    <a href="https://travis-ci.org/siacs/Conversations">
        <img src="https://travis-ci.org/siacs/Conversations.svg?branch=master"
             alt="build status">
    </a>
    <a href="https://bountysource.com/teams/siacs">
        <img src="https://api.bountysource.com/badge/tracker?tracker_id=519483" alt="Bountysource">
    </a>
</p>

<p align="center">
    <a href="https://play.google.com/store/apps/details?id=eu.siacs.conversations&amp;referrer=utm_source%3Dgithub"">
        <img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png"
            height="100" alt="Get it on Google Play">
    </a>
    <a href="https://www.amazon.com/dp/B00WD35AAC/">
        <img src="https://images-na.ssl-images-amazon.com/images/G/01/mobile-apps/devportal2/res/images/amazon-appstore-badge-english-black.png"
            height="70" alt="Get it on Amazon">
    </a>
</p>

![screenshots](https://raw.githubusercontent.com/siacs/Conversations/master/screenshots.png)


## Design Principles

* Be as beautiful and easy to use as possible without sacrificing security or
  privacy
* Rely on existing, well established protocols (XMPP)
* Do not require a Google Account or specifically Google Cloud Messaging (GCM)


## Features

* End-to-end encryption with [OMEMO](https://conversations.im/omemo/) or [OpenPGP](https://www.openpgp.org/about/)
* Send and receive images as well as other kinds of files
* Share your location
* Send voice messages
* Indication when your contact has read your message
* Intuitive UI that follows Android Design guidelines
* Pictures / Avatars for your contacts
* Syncing with desktop client
* Conferences (with support for bookmarks)
* Address book integration
* Multiple accounts / unified inbox
* Very low impact on battery life


### XMPP Features

Conversations works with every XMPP server out there. However, XMPP is an
extensible protocol. These extensions are standardized as well in so-called
XEPs. Conversations supports a couple of these to make the overall user
experience better. There is a chance that your current XMPP server does not
support these extensions; therefore, to get the most out of Conversations, you
should consider either switching to an XMPP server that does, or — even better —
run your own XMPP server for you and your friends. These XEPs are:

* [XEP-0065: SOCKS5 Bytestreams](https://xmpp.org/extensions/xep-0065.html) (or mod_proxy65). Will be used to transfer
  files if both parties are behind a firewall (NAT).
* [XEP-0163: Personal Eventing Protocol](https://xmpp.org/extensions/xep-0065.html) for avatars and OMEMO.
* [XEP-0191: Blocking Command](https://xmpp.org/extensions/xep-0191.html) lets you blacklist spammers or block contacts
  without removing them from your roster.
* [XEP-0198: Stream Management](https://xmpp.org/extensions/xep-0198.html) allows XMPP to survive small network outages and
  changes to the underlying TCP connection.
* [XEP-0280: Message Carbons](https://xmpp.org/extensions/xep-0280.html) which automatically syncs the messages you send to
  your desktop client, and thus allows you to switch seamlessly from your mobile
  client to your desktop client and back within one conversation.
* [XEP-0237: Roster Versioning](https://xmpp.org/extensions/xep-0237.html) mainly to save bandwidth on poor mobile connections
* [XEP-0313: Message Archive Management](https://xmpp.org/extensions/xep-0313.html) synchronize message history with the
  server. Catch up with messages that were sent while Conversations was
  offline.
* [XEP-0352: Client State Indication](https://xmpp.org/extensions/xep-0352.html) lets the server know whether or not
  Conversations is in the background. This allows the server to save bandwidth by
  withholding unimportant packages.
* [XEP-0363: HTTP File Upload](https://xmpp.org/extensions/xep-0363.html) allows you to share files in conferences
  and with offline contacts.

## FAQ

### General

#### How do I install Conversations?

Conversations is entirely open-source and licensed under GPLv3. So if you are a
software developer, you can locally clone the sources from GitHub and use Gradle to
build an APK file.

The more convenient way — which not only gives you automatic updates, but also
supports further development of Conversations — is to buy the app in the
[Google Play Store](https://play.google.com/store/apps/details?id=eu.siacs.conversations&referrer=utm_source%3Dgithub).

Buying the app from the Play Store will also give you access to our [beta testing group](#beta).


#### I don't have a Google account, but I would still like to make a contribution.

We accept donations over PayPal, bank transfer, and various crypto-currencies. For donations via PayPal, you
can use the email address `donate@siacs.eu` or the button below.

[![Donate with PayPal](https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CW3SYT3KG5PDL)

**Disclaimer:** I'm not a huge fan of PayPal and their business policies. For
larger contributions, please get in touch with me beforehand and we can talk
about bank transfer (SEPA).


##### Crypto-currencies

Bitcoin: `1AeqNAcg85APAZj9BZfAjdFCC5zesqXp2B`

Bitcoin Cash: `16ABkXzYAwWz8Y5DcWFfbBRqL63g3hzEaU`

Ether: `0x5c4e5239cd9c6f4a909e4e8361526e2e3c8ba9fa`


#### How do I create an account?
XMPP, like Email, is a federated protocol, which means that there is no one company under which you can create an *official XMPP account*.
Instead there are hundreds, or even thousands, of providers out there. One of those providers is our very own [conversations.im](https://account.conversations.im/).
If you don’t want to use *conversations.im*, use a web search engine of your choice to find another provider.
Or maybe your university has one. Or you can run your own. Or ask a friend to run one. Once you've found one, you can use Conversations to create an account. Just select *register new account* on the server within the "create account" dialog.


##### Domain hosting
Using your own domain not only gives you a more recognizable Jabber ID, it also gives you the flexibility to migrate your account between different XMPP providers.
This is a good compromise between the responsibilities of having to operate your own server and the downsides of being dependent on a single provider.

Learn more about [conversations.im Jabber/XMPP domain hosting](https://account.conversations.im/domain/). 


##### Running your own
If you already have a server somewhere and are willing and able to put in the necessary work, one alternative - in the spirit of federation - is to run your own.
We recommend either [Prosody](https://prosody.im/) or [ejabberd](https://www.ejabberd.im/). Both of these have their own strengths. Ejabberd is slightly more mature nowadays but Prosody is arguably easier to set up.

For Prosody, you need a couple of so-called [community modules](https://modules.prosody.im/), most of which are maintained by the same people that develop Prosody.

If you pick Ejabberd, make sure you use the latest version. Linux distributions might bundle some very outdated versions of it.


#### Where can I set up a custom hostname / port?
Conversations will automatically look up the SRV records for your domain name
which can point to any hostname port combination. If your server doesn’t provide
those, please contact your admin and have them read
[this](https://prosody.im/doc/dns#srv_records). If your server operator is unable or unwilling
to fix this, you can enable advanced server settings in the expert settings of
Conversations.


#### I get 'Incompatible server'.

As a regular user, you should be using a different server. The server you selected
is most likely insecure and/or very old.

If you are a server administrator, you should make sure that your server provides
either STARTTLS or [XEP-0368: SRV records for XMPP over TLS](https://xmpp.org/extensions/xep-0368.html).

On rare occasions this error message might also be caused by a server not providing
a login (SASL) mechanism that Conversations is able to handle. Conversations supports
SCRAM-SHA1, PLAIN, EXTERNAL (client certs), and DIGEST-MD5.


#### I get 'Bind failure'. What does that mean?

Some bind failures are transient and resolve themselves after a reconnect.

When trying to connect to OpenFire, the bind failure can be a permanent problem when the domain part of the Jabber ID entered in Conversations doesn’t match the domain the OpenFire server feels responsible for.
For example, OpenFire is configured to use the domain `a.tld`, but the Jabber ID entered is `user@b.tld`, where `b.tld` also points to the same host. During bind, OpenFire tries to reassign the Jabber to `user@a.tld`. Conversations doesn’t like that.

This can be fixed by creating a new account in Conversations that uses the Jabber ID `user@a.tld`.

Note: This is kind of a weird quirk in OpenFire. Most other servers would just throw a 'Server not responsible for domain' error instead of attempting to reassign the Jabber ID.

Maybe you attempted to use the Jabber ID `test@b.tld` because `a.tld` doesn’t point to the correct host. In that case you might have to enable the extended connection settings in the expert settings of Conversations and set a host name.


### I get 'Stream opening error'. What does that mean?

In most cases this error is caused by Ejabberd advertising support for TLSv1.3 but not properly supporting it. This can happen if the OpenSSL version on the server already supports TLSv1.3 but the fast\_tls wrapper library used by ejabberd not (properly) support it. Upgrading fast\_tls and ejabberd or - theoretically - downgrading openssl should fix the issue. A work around is to explicity disable TLSv1.3 support in the ejabberd configuration. More information can be found on [this issue on the ejabberd issue tracker](https://github.com/processone/ejabberd/issues/2614).


#### I’m getting this annoying permanent notification.

Starting with version 2.3.6, Conversations releases distributed over the Google Play Store will display a permanent notification if you are running it on Android 8 and above. This is a rule that it is essentially enforced by the Google Play Store (you won’t have the problem if you are getting your app from F-Droid).

However, you can disable the notification via settings of the operating system (not the settings in Conversations).

**The battery consumption and the entire behaviour of Conversations will remain the same (as good or as bad as it was before). Why is Google doing this to you? We have no idea.**

##### Android &lt;= 7.1
The foreground notification is still controlled over the expert settings within Conversations as it always has been.

##### Android 8.x
Long press the permanent notification and disable that particular type of notification by moving the slider to the left. This will make the notification disappear, but create will another notification (this time created by the operating system itself) that will complain about Conversations (and other apps) using battery. Starting with Android 8.1 you can disable that notification again with the same method described above.

##### Android 9.0+
Long press the permanent notification and press the info `(i)` button to get into the App info screen. In that screen, touch the 'Notification' entry. In the next screen, remove the checkbox for the 'Foreground service' entry. 


#### How do XEP-0357: Push Notifications work?

You need to be running the Play Store version of Conversations and your server needs to support push notifications.¹ Because *Google Cloud Notifications (GCM)* are tied with an API key to a specific app, your server cannot initiate the push message directly.
Instead, your server will send the push notification to the Conversations app server (operated by us), which then acts as a proxy and initiates the push message for you.
The push message sent from our app server through GCM doesn’t contain any personal information. It is just an empty message which will wake up your device and tell Conversations to reconnect to your server. The information sent from your server to our app server depends on the configuration of your server, but can be limited to your account name. In any case the Conversations app server won't redirect any information through GCM even if your server sends this information.

In summary, Google will never get hold of any personal information, besides that *something* happened (which doesn’t even have to be a message; it can be some automated event as well). We - as the operator of the app server - will just get hold of your account name (without being able to tie this to your specific device).

If you don’t want this, simply pick a server which does not offer Push Notifications, or build Conversations yourself without support for push notifications (this is available via a gradle build flavor). Non-Play Store sources of Conversations (like the Amazon App Store) will also offer a version without push notifications. Conversations will just work like before and maintain its own TCP connection in the background.

 ¹ Your server only needs to support the server side of [XEP-0357: Push Notifications](https://xmpp.org/extensions/xep-0357.html). If you use the Play Store version, you do **not** need to run your own app server. The server modules are called *mod_cloud_notify* on Prosody and *mod_push* on Ejabberd.


#### Conversations doesn’t work for me. Where can I get help?

You can join our conference room on `conversations@conference.siacs.eu`.
A lot of people in there are able to answer basic questions about the usage of
Conversations or can provide you with tips on running your own XMPP server. If
you found a bug, or your app crashes, please read the Developer / Report Bugs
section of this document.


#### I need professional support with Conversations or setting up my server.

I'm available for hire. Contact me at `inputmice@siacs.eu`.


#### How does the address book integration work?

The address book integration was designed to protect your privacy. Conversations
neither uploads contacts from your address book to your server nor fills your
address book with unnecessary contacts from your online roster. If you manually
add a Jabber ID to your phones address book, Conversations will use the name and
profile picture of this contact. You can click on the profile picture in the contact
details within Conversations to make the process of adding Jabber IDs to
your address book easier. This will start an "add to address book" intent
with the JID as the payload. This doesn't require Conversations to have write
permissions to your address book, and also doesn't require you to copy/paste a
JID from one app to another.

#### I get 'delivery failed' on my messages.

If you get delivery failed on images, it's probably because the recipient lost
network connectivity during reception. In that case you can try it again at a
later time.

For text messages, the answer to your question is a little bit more complex.
When you see 'delivery failed' on text messages, it is always something that is
being reported by the server. The most common reason for this is that the
recipient failed to resume a connection. When a client loses connectivity for a
short time, the client usually has a five minute window to pick up that
connection again. When the client fails to do so (because the network
connectivity is out for longer than that), all messages sent to that client will
be returned to the sender resulting in a delivery failed.

Instead of returning a message to the sender, both Ejabberd and Prosody have the
ability to store messages in offline storage when the disconnecting client is
the only client. In Prosody, this is available via an extra module called
```mod_smacks_offline```. In Ejabberd this is available via some configuration
settings.

Other less common reasons are that the message you sent didn't meet some
criteria enforced by the server (too large, too many). Another reason could be
that the recipient is offline and the server doesn't provide offline storage.

Usually you are able to distinguish between these two groups in the fact that
the first one happens always after some time and the second one happens almost
instantly.


#### Where can I see the status of my contacts? How can I set a status or priority?

Statuses are a horrible metric. Setting them manually to a proper value rarely
works because users are either lazy or just forget about them. Setting them
automatically does not provide quality results either. Keyboard or mouse
activity as an indicator (for example) fails when the user is just looking at
something (reading an article, watching a movie). Furthermore, automatic setting
of statuses always implies an impact on your privacy (are you sure you want
everybody in your contact list to know that you have been using your computer at
4AM?).

In the past, statuses have been used to judge the likelihood of whether or not your
messages are being read. This is no longer necessary. With Chat Markers
(XEP-0333, supported by Conversations since 0.4) we have the ability to **know**
whether or not your messages are being read. Similar things can be said for
priorities. In the past, priorities have been used (by servers, not by clients!)
to route your messages to one specific client. With carbon messages (XEP-0280,
supported by Conversations since 0.1), this is no longer necessary. Using
priorities to route OTR messages isn't practical either because they are not
changeable on the fly. Metrics like last active client (the client which sent
the last message) are much better.

Unfortunately these modern replacements for legacy XMPP features are not widely
adopted. However, Conversations should be an instant messenger for the future, and
instead of making Conversations compatible with the past, we should work on
implementing new, improved technologies and getting them into other XMPP clients
as well.

Making them status and priority optional isn't a solution either because
Conversations is trying to get rid of old behaviours and set an example for
other clients.


#### Translations

Translations are managed on [Transifex](https://www.transifex.com/projects/p/conversations/)


#### How do I backup / move Conversations to a new device?

On the one hand Conversations supports Message Archive Management to keep a server side history of your messages, so when you migrate to a new device, that device can display your entire history.
However, that does not work if you enable OMEMO (due to its forward secrecy). (Read [The State of Mobile XMPP in 2016](https://gultsch.de/xmpp_2016.html), especially the section on encryption.)

If you migrate to a new device and would still like to keep your history, please use a third party backup tool like [oandbackup](https://github.com/jensstein/oandbackup) (needs root access on the device) or ```adb backup``` (no root access needed) from your computer.
It is important that you disable (NOT delete) your account before backup, and enable it only after a successful restore. Otherwise, OMEMO might not work afterwards. Also, remember that you can **only** transfer the backup to either the same version of Android or to a newer one (eg. 5.1.1 -> 5.1.1, 5.1.1 -> 6.0.1).


#### Conversations is missing a certain feature.

I'm open for new feature suggestions. You can use the [issue tracker][issues] on
GitHub. Please take some time to browse through the issues to see if someone
else already suggested it. Be assured that I read each and every ticket. If I
like it I will leave it open until it's implemented. If I don't like it I will
close it (usually with a short comment). If I don't comment on a feature
request that's probably a good sign because this means I agree with you.
Commenting with +1 on either open or closed issues won't change my mind, nor
will it accelerate the development.


#### You closed my feature request, but I want it really really badly...

Just write it yourself and send me a pull request. If I like it, I will happily
merge it. If I don't, at least you and like-minded people get to enjoy it.


#### I need a feature and I need it now!

I am available for hire. Contact me via XMPP: `inputmice@siacs.eu`


### Security

#### Why are there two end-to-end encryption methods, and which one should I choose?

* OMEMO works even when a contact is offline, and works with multiple devices. It also allows asynchronous file-transfer when the server has [HTTP File Upload](http://xmpp.org/extensions/xep-0363.html).
However, OMEMO is not widely supported, and is currently only implemented [by a handful of clients](https://omemo.top).
* OpenPGP (XEP-0027) is a very old encryption method that has some advantages over OMEMO, but should only be used by people who know what they are doing.


#### How do I use OpenPGP?

Before you continue reading, you should note that the OpenPGP support in
Conversations is experimental. This is not because it will make the app unstable,
but because the fundamental concepts of PGP aren't ready for widespread use.
The way PGP works is that you trust Key IDs instead of JIDs or email addresses.
So in theory, your contact list should consist of Public-Key-IDs instead of
JIDs. But of course no email or XMPP client out there implements these
concepts. Plus PGP in the context of instant messaging has a couple of
downsides: It is vulnerable to replay attacks and it is rather verbose.

To use OpenPGP, first you have to install the open-source app
[OpenKeychain](https://www.openkeychain.org/), and then long press on the account in
manage accounts and choose renew PGP announcement from the contextual menu.


#### OMEMO is grayed out. What do I do?

OMEMO is only available in 1:1 chats and private (members-only, non-anonymous) group chats.
Encrypting public group chats makes little to no sense since anyone (including a hypothetical attacker) can join and a user couldn’t possibily verify all participants anyway.
Furthermore for a lot of public group chats it is generally desirable to give newcomers access to the full history.


#### OMEMO doesn’t work. I get a 'Something went wrong' message in the 'Trust OMEMO Fingerprints' screen.

OMEMO has two requirements: Your server and the server of your contact need to support PEP. Both of you can verify that individually by opening your account details and selecting ```Server info``` from the menu. The appearing table should list PEP as available.
The second requirement is that the initial sender needs to have access to the published key material. This can either be achieved by having mutual presence subscription (you can verify that by opening the contact details and see if both check boxes *Send presence updates* and *Receive presence updates* are checked) or by using a server that makes the public key material accessible to anyone.
In the [Compliance Tester](https://compliance.conversations.im), this is indicated by the 'OMEMO' feature. Since it is very common that the first messages are exchanged *before* adding each other to the contact list, it is desirable to use servers that have 'OMEMO support'.


#### How does the encryption for group chats work?

##### OMEMO

OMEMO encryption works only in private (members only) conferences that are non-anonymous. Non-anonymous (being able to discover the real JID of other participants) is a technical requirement to discover the key material.
Members only is a sort of arbitrary requirement imposed by Conversations. (see 'OMEMO is grayed out')

The servers of all participants need to pass the OMEMO [Compliance Test](https://conversations.im/compliance/).
In other words, they either need to run Ejabberd 18.01+ or Prosody 0.11+ (alternatively, it would also work if all participants had each other in their contact list; but that rarely is the case in larger group chats).

The owner of a conference can make a public conference private by going into the conference
details and hit the settings button (the one with the gears), and selecting both *private* and
*members only*.


##### OpenPGP

Every participant has to announce their OpenPGP key (see answer above).
If you would like to send encrypted messages to a conference, you have to make
sure that you have every participant's public key in your OpenKeychain.
Right now there is no check in Conversations to ensure that.
You have to take care of that yourself. Go to the conference details and
touch every key id (The hexadecimal number below a contact). This will send you
to OpenKeychain (which will assist you on adding the key). This works best in
very small conferences with contacts you are already using OpenPGP with. This
feature is regarded as experimental. Conversations is the only client that uses
XEP-0027 with conferences. (The XEP neither specifically allows nor disallows
this.)


#### What is Blind Trust Before Verification / why are messages marked with a red lock?

Read more about the concept on https://gultsch.de/trust.html

#### What happened to OTR support?
OTR was removed because it was highly unreliable. It didn’t work with multiple devices and was never really specified to work with XMPP.
The codebase was a mess (there was an *HTML parser* in there to deal with the garbage some OTR clients would send). Verification was implemented in a non-blocking way.
It would tell you if the current session was using an unknown fingerprint but it didn’t actively stop you from sending messages until you have confirmed the new fingerprint (like Conversations would do now with BTBV after verification or when BTBV is turned off).
Considering the previous points there was little to no desire from my point to fix this potential security issue or clean up the code base. Another reason for the removal was that people would use it *accidentally* to communicate between two Conversations clients because they read somewhere that OTR is good.
OTR is still available in [Conversations Legacy](https://github.com/siacs/Conversations/tree/legacy).

### What clients can I use on other platforms?

There are XMPP Clients available for all major platforms.


#### Windows / Linux

For your desktop computer we recommend that you use [Gajim](https://gajim.org/). You need to install the plugins `OMEMO`, `HTTP Upload`, and `URL image preview` to get the best compatibility with Conversations. Plugins can be installed from within the app.


#### iOS

Unfortunately we don‘t have a recommendation for iPhones right now. There are two clients available: [ChatSecure](https://chatsecure.org/) and [Monal](https://monal.im/). Both have their own pros and cons.


### Development

<a name="beta"></a>
#### Beta testing
If you bought the App on [Google Play](https://play.google.com/store/apps/details?id=eu.siacs.conversations),
you can get access to the the latest beta version by signing up using [this link](https://play.google.com/apps/testing/eu.siacs.conversations).


#### How do I build Conversations?

Make sure `ANDROID_HOME` points to your Android SDK. Use the Android SDK Manager to install missing dependencies.

    git clone https://github.com/siacs/Conversations.git
    cd Conversations
    ./gradlew assembleConversationsFreeSystemDebug

There are two build flavors available: *free* and *playstore*. Unless you know what you are doing, you only need *free*.

[![Build Status](https://travis-ci.org/siacs/Conversations.svg?branch=development)](https://travis-ci.org/siacs/Conversations)


#### How do I update/add external libraries?

If the library you want to update is in Maven Central or JCenter (or has its own
Maven repo), add it or update its version in `build.gradle`. If the library is
in the `libs/` directory, you can update it using a subtree merge by doing the
following (using `minidns` as an example):

    git remote add minidns https://github.com/rtreffer/minidns.git
    git fetch minidns
    git merge -s subtree minidns master

To add a new dependency to the `libs/` directory (replacing "name", "branch" and
"url" as necessary):

    git remote add name url
    git merge -s ours --no-commit name/branch
    git read-tree --prefix=libs/name -u name/branch
    git commit -m "Subtree merged in name"

#### How do I debug Conversations

If something goes wrong, Conversations usually exposes very little information in
the UI (other than the fact that something didn't work). However, with ADB,
(Android Debug Bridge) you can squeeze some more information out of Conversations.
This information is especially useful if you are experiencing trouble with
your connection or with file transfer.

To use ADB, you have to connect your mobile phone to your computer with a USB cable
and install `adb`. Most Linux systems have prebuilt packages for that tool. On
Debian/Ubuntu, for example, it is called `android-tools-adb`.

Furthermore, you might have to enable 'USB debugging' in the Developer options of your
phone. After that, you can just execute the following on your computer:

    adb -d logcat -v time -s conversations

If need be, there are also some apps on the Play Store that can be used to show the logcat
directly on your rooted phone (search for logcat). However, in regards to further processing
(for example: to create an issue here on GitHub), it is more convenient to just use your PC.


#### I found a bug.

Please report it to our [issue tracker][issues]. If your app crashes, please
provide a stack trace. If you are experiencing misbehavior, please provide
detailed steps to reproduce. Always mention whether you are running the latest
Play Store version or the current HEAD. If you are having problems connecting to
your XMPP server or your file transfer doesn’t work as expecte, please always
include a logcat debug output with your issue (see above).

[issues]: https://github.com/siacs/Conversations/issues
