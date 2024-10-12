import request from '@/utils/request'

// 查询通用数据配置列表
export function listGeneral_data_set(query) {
  return request({
    url: '/system/general_data_set/list',
    method: 'get',
    params: query
  })
}

// 查询通用数据配置详细
export function getGeneral_data_set(id) {
  return request({
    url: '/system/general_data_set/' + id,
    method: 'get'
  })
}

// 新增通用数据配置
export function addGeneral_data_set(data) {
  return request({
    url: '/system/general_data_set',
    method: 'post',
    data: data
  })
}

// 修改通用数据配置
export function updateGeneral_data_set(data) {
  return request({
    url: '/system/general_data_set',
    method: 'put',
    data: data
  })
}

// 删除通用数据配置
export function delGeneral_data_set(id) {
  return request({
    url: '/system/general_data_set/' + id,
    method: 'delete'
  })
}
