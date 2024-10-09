import request from '@/utils/request'

// 查询模型数据库列表
export function listModel_database(query) {
  return request({
    url: '/system/model_database/list',
    method: 'get',
    params: query
  })
}

// 查询模型数据库详细
export function getModel_database(id) {
  return request({
    url: '/system/model_database/' + id,
    method: 'get'
  })
}

// 新增模型数据库
export function addModel_database(data) {
  return request({
    url: '/system/model_database',
    method: 'post',
    data: data
  })
}

// 修改模型数据库
export function updateModel_database(data) {
  return request({
    url: '/system/model_database',
    method: 'put',
    data: data
  })
}

// 删除模型数据库
export function delModel_database(id) {
  return request({
    url: '/system/model_database/' + id,
    method: 'delete'
  })
}
