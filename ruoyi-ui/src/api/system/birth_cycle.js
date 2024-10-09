import request from '@/utils/request'

// 查询生育周期设置列表
export function listBirth_cycle(query) {
  return request({
    url: '/system/birth_cycle/list',
    method: 'get',
    params: query
  })
}

// 查询生育周期设置详细
export function getBirth_cycle(id) {
  return request({
    url: '/system/birth_cycle/' + id,
    method: 'get'
  })
}

// 新增生育周期设置
export function addBirth_cycle(data) {
  return request({
    url: '/system/birth_cycle',
    method: 'post',
    data: data
  })
}

// 修改生育周期设置
export function updateBirth_cycle(data) {
  return request({
    url: '/system/birth_cycle',
    method: 'put',
    data: data
  })
}

// 删除生育周期设置
export function delBirth_cycle(id) {
  return request({
    url: '/system/birth_cycle/' + id,
    method: 'delete'
  })
}
