package org.swtk.commons.dict.wordnet.index.name.instance.n.e.c.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNECR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"necrobiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11506578\"]}");
	add("{\"term\":\"necrology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06505917\", \"06760847\"]}");
	add("{\"term\":\"necrolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13541832\"]}");
	add("{\"term\":\"necromancer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10370883\", \"10645222\"]}");
	add("{\"term\":\"necromancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05785436\", \"05987679\"]}");
	add("{\"term\":\"necromania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205547\"]}");
	add("{\"term\":\"necrophagia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00844080\"]}");
	add("{\"term\":\"necrophagy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00844080\"]}");
	add("{\"term\":\"necrophilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205547\"]}");
	add("{\"term\":\"necrophilism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205547\"]}");
	add("{\"term\":\"necropolis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08538806\"]}");
	add("{\"term\":\"necropsy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00142216\"]}");
	add("{\"term\":\"necrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11507108\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }