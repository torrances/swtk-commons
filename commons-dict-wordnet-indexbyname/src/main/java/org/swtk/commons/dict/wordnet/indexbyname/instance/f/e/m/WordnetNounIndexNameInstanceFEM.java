package org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08140952\"]}");
	add("{\"term\":\"female\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09642198\", \"01323363\"]}");
	add("{\"term\":\"femaleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05016127\"]}");
	add("{\"term\":\"feminine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06339989\"]}");
	add("{\"term\":\"feminineness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05016127\"]}");
	add("{\"term\":\"femininity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04674763\"]}");
	add("{\"term\":\"feminisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13500808\"]}");
	add("{\"term\":\"feminism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00802082\", \"05976640\"]}");
	add("{\"term\":\"feminist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10104404\"]}");
	add("{\"term\":\"feminization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13500808\"]}");
	add("{\"term\":\"femoris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05581526\"]}");
	add("{\"term\":\"femtochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099652\"]}");
	add("{\"term\":\"femtometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13679309\"]}");
	add("{\"term\":\"femtometre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13679309\"]}");
	add("{\"term\":\"femtosecond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15260484\"]}");
	add("{\"term\":\"femtovolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13664588\"]}");
	add("{\"term\":\"femur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05581526\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }