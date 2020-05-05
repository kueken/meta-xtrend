KV = "3.8.7"
SRCDATE = "20180412"

RDEPENDS_${PN} += "et-fpupdate-${MACHINE}"

SRC_URI = "https://github.com/neo-pli-bsps/meta-xtrend/releases/download/Binaries-1.0/et9x00-drivers-3.8.7-${SRCDATE}.zip"

require et-dvb-modules.inc

SRC_URI[md5sum] = "b9582de49bfdd5f6506c2b0e4757b540"
SRC_URI[sha256sum] = "38e3b6be3e1112b5a32784ccdb7280828db5a8ced542320470ccee50540197c3"

COMPATIBLE_MACHINE = "et9.00"
