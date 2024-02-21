import os
import re
import tarfile
from tarfile import TarInfo

tar = tarfile.open("D:\\Links\\py150_files\\data.tar")
total, np_count = 0, 0
for m in tar.getmembers():
    info: TarInfo = m
    if os.path.splitext(info.name)[1] != ".py":
        continue

    f = tar.extractfile(info)
    if f is None:
        continue

    total += 1
    content = f.read().decode('latin-1')
    n1 = re.match('import.* numpy.* as.* (\w+)', content)
    n2 = re.match('from.* numpy.* import.* (\w+)', content)
    if n1 is None and n2 is None:
        continue

    if n1 is not None:
        print(n1.group(1))
    if n2 is not None:
        print(n2.group(1))
    np_count += 1

tar.close()
print(total, np_count)
