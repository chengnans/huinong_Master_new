import request from '@/utils/request'

// 查询农事分类列表
export function listFarm_classify(query) {
  return request({
    url: '/system/farm_classify/list',
    method: 'get',
    params: query
  })
}

// 查询农事分类详细
export function getFarm_classify(id) {
  return request({
    url: '/system/farm_classify/' + id,
    method: 'get'
  })
}

// 新增农事分类
export function addFarm_classify(data) {
  return request({
    url: '/system/farm_classify',
    method: 'post',
    data: data
  })
}

// 修改农事分类
export function updateFarm_classify(data) {
  return request({
    url: '/system/farm_classify',
    method: 'put',
    data: data
  })
}

// 删除农事分类
export function delFarm_classify(id) {
  return request({
    url: '/system/farm_classify/' + id,
    method: 'delete'
  })
}
