import request from '@/utils/request'

// 查询灾害模型列表
export function listDisaster_model(query) {
  return request({
    url: '/system/disaster_model/list',
    method: 'get',
    params: query
  })
}

// 查询灾害模型详细
export function getDisaster_model(id) {
  return request({
    url: '/system/disaster_model/' + id,
    method: 'get'
  })
}

// 新增灾害模型
export function addDisaster_model(data) {
  return request({
    url: '/system/disaster_model',
    method: 'post',
    data: data
  })
}

// 修改灾害模型
export function updateDisaster_model(data) {
  return request({
    url: '/system/disaster_model',
    method: 'put',
    data: data
  })
}

// 删除灾害模型
export function delDisaster_model(id) {
  return request({
    url: '/system/disaster_model/' + id,
    method: 'delete'
  })
}
