KV = "4.10.6"
SRCDATE = "20180412"

SRC_URI = "https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/et8000-drivers-4.10.6-${SRCDATE}.zip"

require et-dvb-modules.inc

SRC_URI[md5sum] = "5663745c39cabd7e0a5e9d1289ab1313"
SRC_URI[sha256sum] = "095d2600078b43dcfe3e23133e38e7f3b6a54cfe51a6035252d3535eda4f722c"

COMPATIBLE_MACHINE = "et8000"
