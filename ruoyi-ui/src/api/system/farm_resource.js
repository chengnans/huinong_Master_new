import request from '@/utils/request'

// 查询农资管理列表
export function listFarm_resource(query) {
  return request({
    url: '/system/farm_resource/list',
    method: 'get',
    params: query
  })
}

// 查询农资管理详细
export function getFarm_resource(id) {
  return request({
    url: '/system/farm_resource/' + id,
    method: 'get'
  })
}

// 新增农资管理
export function addFarm_resource(data) {
  return request({
    url: '/system/farm_resource',
    method: 'post',
    data: data
  })
}

// 修改农资管理
export function updateFarm_resource(data) {
  return request({
    url: '/system/farm_resource',
    method: 'put',
    data: data
  })
}

// 删除农资管理
export function delFarm_resource(id) {
  return request({
    url: '/system/farm_resource/' + id,
    method: 'delete'
  })
}
