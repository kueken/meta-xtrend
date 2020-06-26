KV = "3.8.7"
SRCDATE = "20130524"

RDEPENDS_${PN} += "et-fpupdate-${MACHINE}"

SRC_URI = "https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/et9x00-drivers-3.8.7-${SRCDATE}.zip"

require et-dvb-modules.inc

SRC_URI[md5sum] = "4a4b303b3b913f0ee64f52afc4a60be7"
SRC_URI[sha256sum] = "f6b59f464b70406b95a5dd8cb2e6260b57d11d5568009586163849c7e9091773"

COMPATIBLE_MACHINE = "et9x00"
