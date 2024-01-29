import tensorflow as tf
import torch

print("gpu_available", tf.test.is_gpu_available())
print("is_cuda_gpu_available", tf.test.is_gpu_available(cuda_only=True))

print("cuda" if torch.cuda.is_available() else "cpu")
