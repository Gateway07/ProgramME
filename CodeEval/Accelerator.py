from accelerate import Accelerator

accelerator = Accelerator(fp16=True)
accelerator.prepare()
