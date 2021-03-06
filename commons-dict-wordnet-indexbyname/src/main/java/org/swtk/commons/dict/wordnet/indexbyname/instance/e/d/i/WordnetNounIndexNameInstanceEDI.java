package org.swtk.commons.dict.wordnet.indexbyname.instance.e.d.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEDI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"edibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05004637\"]}");
	add("{\"term\":\"edible\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572202\"]}");
	add("{\"term\":\"edible asparagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12461688\"]}");
	add("{\"term\":\"edible banana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12373720\"]}");
	add("{\"term\":\"edible bean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07740688\"]}");
	add("{\"term\":\"edible cockle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01962818\"]}");
	add("{\"term\":\"edible corn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07747928\"]}");
	add("{\"term\":\"edible fat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687880\"]}");
	add("{\"term\":\"edible fruit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07721676\"]}");
	add("{\"term\":\"edible mussel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01966912\"]}");
	add("{\"term\":\"edible nut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07753057\"]}");
	add("{\"term\":\"edible sea urchin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02321960\"]}");
	add("{\"term\":\"edible seed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07786547\"]}");
	add("{\"term\":\"edible snail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01947453\"]}");
	add("{\"term\":\"edibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05004637\"]}");
	add("{\"term\":\"edict\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06551761\", \"06739420\"]}");
	add("{\"term\":\"edification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05996720\"]}");
	add("{\"term\":\"edifice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02916498\"]}");
	add("{\"term\":\"edinburgh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08912823\"]}");
	add("{\"term\":\"edirne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08935884\"]}");
	add("{\"term\":\"edison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10969184\"]}");
	add("{\"term\":\"edith cavell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10907903\"]}");
	add("{\"term\":\"edith giovanna gassion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11254142\"]}");
	add("{\"term\":\"edith louisa cavell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10907903\"]}");
	add("{\"term\":\"edith newbold jones wharton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11402790\"]}");
	add("{\"term\":\"edith piaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11254142\"]}");
	add("{\"term\":\"edith wharton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11402790\"]}");
	add("{\"term\":\"editing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06439501\"]}");
	add("{\"term\":\"edition\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05849159\", \"06609557\", \"07976007\", \"06602727\"]}");
	add("{\"term\":\"editor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06587017\", \"10064687\"]}");
	add("{\"term\":\"editor in chief\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10064687\"]}");
	add("{\"term\":\"editor program\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06587017\"]}");
	add("{\"term\":\"editorial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06279220\"]}");
	add("{\"term\":\"editorial department\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08135389\"]}");
	add("{\"term\":\"editorialist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09958612\"]}");
	add("{\"term\":\"editorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00593217\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }