import request from '@/utils/request'

// 查询种植户管理列表
export function listGrowers(query) {
  return request({
    url: '/system/growers/list',
    method: 'get',
    params: query
  })
}

// 查询种植户管理详细
export function getGrowers(id) {
  return request({
    url: '/system/growers/' + id,
    method: 'get'
  })
}

// 新增种植户管理
export function addGrowers(data) {
  return request({
    url: '/system/growers',
    method: 'post',
    data: data
  })
}

// 修改种植户管理
export function updateGrowers(data) {
  return request({
    url: '/system/growers',
    method: 'put',
    data: data
  })
}

// 删除种植户管理
export function delGrowers(id) {
  return request({
    url: '/system/growers/' + id,
    method: 'delete'
  })
}
