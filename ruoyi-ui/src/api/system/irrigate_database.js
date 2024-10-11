import request from '@/utils/request'

// 查询灌区数据库列表
export function listIrrigate_database(query) {
  return request({
    url: '/system/irrigate_database/list',
    method: 'get',
    params: query
  })
}

// 查询灌区数据库详细
export function getIrrigate_database(id) {
  return request({
    url: '/system/irrigate_database/' + id,
    method: 'get'
  })
}

// 新增灌区数据库
export function addIrrigate_database(data) {
  return request({
    url: '/system/irrigate_database',
    method: 'post',
    data: data
  })
}

// 修改灌区数据库
export function updateIrrigate_database(data) {
  return request({
    url: '/system/irrigate_database',
    method: 'put',
    data: data
  })
}

// 删除灌区数据库
export function delIrrigate_database(id) {
  return request({
    url: '/system/irrigate_database/' + id,
    method: 'delete'
  })
}
