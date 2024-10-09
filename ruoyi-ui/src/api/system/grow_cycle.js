import request from '@/utils/request'

// 查询生长周期识别列表
export function listGrow_cycle(query) {
  return request({
    url: '/system/grow_cycle/list',
    method: 'get',
    params: query
  })
}

// 查询生长周期识别详细
export function getGrow_cycle(id) {
  return request({
    url: '/system/grow_cycle/' + id,
    method: 'get'
  })
}

// 新增生长周期识别
export function addGrow_cycle(data) {
  return request({
    url: '/system/grow_cycle',
    method: 'post',
    data: data
  })
}

// 修改生长周期识别
export function updateGrow_cycle(data) {
  return request({
    url: '/system/grow_cycle',
    method: 'put',
    data: data
  })
}

// 删除生长周期识别
export function delGrow_cycle(id) {
  return request({
    url: '/system/grow_cycle/' + id,
    method: 'delete'
  })
}
