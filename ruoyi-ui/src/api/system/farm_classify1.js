import request from '@/utils/request'

// 查询农事分类设置列表
export function listFarm_classify1(query) {
  return request({
    url: '/system/farm_classify1/list',
    method: 'get',
    params: query
  })
}

// 查询农事分类设置详细
export function getFarm_classify1(id) {
  return request({
    url: '/system/farm_classify1/' + id,
    method: 'get'
  })
}

// 新增农事分类设置
export function addFarm_classify1(data) {
  return request({
    url: '/system/farm_classify1',
    method: 'post',
    data: data
  })
}

// 修改农事分类设置
export function updateFarm_classify1(data) {
  return request({
    url: '/system/farm_classify1',
    method: 'put',
    data: data
  })
}

// 删除农事分类设置
export function delFarm_classify1(id) {
  return request({
    url: '/system/farm_classify1/' + id,
    method: 'delete'
  })
}
