package org.swtk.commons.dict.wordnet.index.name.instance.a.r.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"armiger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09828014\", \"09828109\"]}");
	add("{\"term\":\"armilla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02742128\", \"02742253\"]}");
	add("{\"term\":\"armillaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13252334\"]}");
	add("{\"term\":\"armillariella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13253413\"]}");
	add("{\"term\":\"armin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10842390\"]}");
	add("{\"term\":\"arming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01159386\"]}");
	add("{\"term\":\"arminian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10758528\"]}");
	add("{\"term\":\"arminianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06239699\"]}");
	add("{\"term\":\"arminius\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10842390\", \"10842566\"]}");
	add("{\"term\":\"armistice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13994359\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }