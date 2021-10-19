#! /bin/bash

if [[ ${SSH_AGENT_PID} -gt 100 ]]
then
    echo "hurrah"
else
    echo "boo"
fi
