import request from '@/utils/request'

// 查询肥料数据库列表
export function listFertilizer_database(query) {
  return request({
    url: '/system/fertilizer_database/list',
    method: 'get',
    params: query
  })
}

// 查询肥料数据库详细
export function getFertilizer_database(id) {
  return request({
    url: '/system/fertilizer_database/' + id,
    method: 'get'
  })
}

// 新增肥料数据库
export function addFertilizer_database(data) {
  return request({
    url: '/system/fertilizer_database',
    method: 'post',
    data: data
  })
}

// 修改肥料数据库
export function updateFertilizer_database(data) {
  return request({
    url: '/system/fertilizer_database',
    method: 'put',
    data: data
  })
}

// 删除肥料数据库
export function delFertilizer_database(id) {
  return request({
    url: '/system/fertilizer_database/' + id,
    method: 'delete'
  })
}
