#!/bin/bash
LOG=release-notes.txt
TEMP=release-notes.temp
git log --oneline $(git describe --abbrev=0 --tags 2>&1).. > ${LOG}
cut -d' ' -f2-  ${LOG} > ${TEMP}
while read -r line
do
    echo "* $line"
done <${TEMP} > ${LOG}
rm ${TEMP}