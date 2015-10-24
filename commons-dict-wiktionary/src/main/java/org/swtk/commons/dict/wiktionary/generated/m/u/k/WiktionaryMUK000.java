package org.swtk.commons.dict.wiktionary.generated.m.u.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMUK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mukluk", "{\"term\":\"mukluk\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"central siberian yupik\"], \"text\":\"From Central siberian yupik \u0027maklak\u0027 (bearded seal) referring to sealskin used to make boots.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A soft knee-high boot of sealskin or reindeer skin, originally worn by Inuit and Yupik\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1898\u0027\u0027, \u0027Medicine Hat News\u0027, December 8, p 5\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Her parkee, made of Caribou, it is a lovely fit, / And she\u0027s all right from \u0027\u0027muck-a-luck\u0027\u0027 unto her dainty mit. / This lovely Klooch is fond of Hooch, and makes it very well\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A laced winter boot resembling a traditional mukluk, with thick rubber sole and cloth upper\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1966\u0027\u0027, \u0027Kingston Whig-Standard\u0027, April 27, p 26\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"the Canadians’ [soldiers’] \u0027\u0027mukluks\u0027\u0027 and sleeping bags were superior to anything in use. the \u0027\u0027mukluk\u0027\u0027, a rubber-soled boot with a calf-high outer nylon cover, has a thick woollen inner boot that keeps feet warm in the coldest of weather\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Paola Gianturco, \u0027Celebrating Women\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The skin is used to make \u0027\u0027mukluks\u0027\u0027, hats, parkas. We are resourceful and respectful of the animals, the land\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }