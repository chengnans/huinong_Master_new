import request from '@/utils/request'

// 查询农业分类设置列表
export function listAgricultural_classification(query) {
  return request({
    url: '/system/agricultural_classification/list',
    method: 'get',
    params: query
  })
}

// 查询农业分类设置详细
export function getAgricultural_classification(id) {
  return request({
    url: '/system/agricultural_classification/' + id,
    method: 'get'
  })
}

// 新增农业分类设置
export function addAgricultural_classification(data) {
  return request({
    url: '/system/agricultural_classification',
    method: 'post',
    data: data
  })
}

// 修改农业分类设置
export function updateAgricultural_classification(data) {
  return request({
    url: '/system/agricultural_classification',
    method: 'put',
    data: data
  })
}

// 删除农业分类设置
export function delAgricultural_classification(id) {
  return request({
    url: '/system/agricultural_classification/' + id,
    method: 'delete'
  })
}
