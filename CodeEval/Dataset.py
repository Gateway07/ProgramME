from datasets import load_dataset

root = "D:\\git\\Code\\methods2test\\corpus\\json\\test\\100069523"
data_files = {"test": root + "test.tar.bz2"}
ds = load_dataset("json", data_dir=root, streaming=True)

for f in ds["train"]:
    print(f["target"])
    print(f["src_fm_fc_ms_ff"])
