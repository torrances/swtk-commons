package org.swtk.commons.dict.wiktionary.generated.v.o.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVOU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vouacapenol", "{\"term\":\"vouacapenol\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Vouacapoua|ol|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alcohol obtained from the legume genus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("voucher", "{\"term\":\"voucher\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|vouch|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A piece of paper that entitles the holder to a discount, or that can be exchanged for goods and services\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A receipt\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One who or that which vouches\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1836\u0027\u0027, \u0027The New Sporting Magazine\u0027 (volume 11, page 227\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"To the fashionable world he cannot be a stranger and his having married a sister of the Duke of Leeds is a \u0027\u0027voucher\u0027\u0027 for my assertion\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }