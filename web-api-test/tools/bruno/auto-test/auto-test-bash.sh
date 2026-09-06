#!/bin/bash

set -e

echo "Starting API automated tests..."
cd ../collections

bru run

# 使用特定ENV来测试
# bru run ./bruno --env dev

echo "API tests passed."