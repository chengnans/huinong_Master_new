import request from '@/utils/request'

// 查询故事库列表
export function listStory_library(query) {
  return request({
    url: '/system/story_library/list',
    method: 'get',
    params: query
  })
}

// 查询故事库详细
export function getStory_library(id) {
  return request({
    url: '/system/story_library/' + id,
    method: 'get'
  })
}

// 新增故事库
export function addStory_library(data) {
  return request({
    url: '/system/story_library',
    method: 'post',
    data: data
  })
}

// 修改故事库
export function updateStory_library(data) {
  return request({
    url: '/system/story_library',
    method: 'put',
    data: data
  })
}

// 删除故事库
export function delStory_library(id) {
  return request({
    url: '/system/story_library/' + id,
    method: 'delete'
  })
}
