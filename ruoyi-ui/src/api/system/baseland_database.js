import request from '@/utils/request'

// 查询基地数据库列表
export function listBaseland_database(query) {
  return request({
    url: '/system/baseland_database/list',
    method: 'get',
    params: query
  })
}

// 查询基地数据库详细
export function getBaseland_database(id) {
  return request({
    url: '/system/baseland_database/' + id,
    method: 'get'
  })
}

// 新增基地数据库
export function addBaseland_database(data) {
  return request({
    url: '/system/baseland_database',
    method: 'post',
    data: data
  })
}

// 修改基地数据库
export function updateBaseland_database(data) {
  return request({
    url: '/system/baseland_database',
    method: 'put',
    data: data
  })
}

// 删除基地数据库
export function delBaseland_database(id) {
  return request({
    url: '/system/baseland_database/' + id,
    method: 'delete'
  })
}
