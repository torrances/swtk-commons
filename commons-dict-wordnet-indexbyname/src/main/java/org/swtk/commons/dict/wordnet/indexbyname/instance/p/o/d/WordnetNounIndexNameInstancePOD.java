package org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pod\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03980303\", \"08011606\", \"13159832\", \"13160826\"]}");
	add("{\"term\":\"podalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14353606\"]}");
	add("{\"term\":\"podalyria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12583909\"]}");
	add("{\"term\":\"podargidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01839450\"]}");
	add("{\"term\":\"podargus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01839594\"]}");
	add("{\"term\":\"podaxaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12990953\"]}");
	add("{\"term\":\"podetium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11554612\"]}");
	add("{\"term\":\"podiatrist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09938755\"]}");
	add("{\"term\":\"podiatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06071626\"]}");
	add("{\"term\":\"podiceps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02052509\"]}");
	add("{\"term\":\"podicipedidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02052326\"]}");
	add("{\"term\":\"podicipediformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02051953\"]}");
	add("{\"term\":\"podicipitiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02051953\"]}");
	add("{\"term\":\"podilymbus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02053575\"]}");
	add("{\"term\":\"podium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03164306\"]}");
	add("{\"term\":\"podocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11672490\"]}");
	add("{\"term\":\"podocarpaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11671710\"]}");
	add("{\"term\":\"podocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11672182\"]}");
	add("{\"term\":\"podophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11720384\"]}");
	add("{\"term\":\"podsol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15017704\"]}");
	add("{\"term\":\"podzol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15017704\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }