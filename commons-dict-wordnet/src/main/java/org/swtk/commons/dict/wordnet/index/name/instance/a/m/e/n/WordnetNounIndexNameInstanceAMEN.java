package org.swtk.commons.dict.wordnet.index.name.instance.a.m.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09534502\"]}");
	add("{\"term\":\"amenability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04913203\"]}");
	add("{\"term\":\"amenableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04913203\"]}");
	add("{\"term\":\"amendment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06736384\", \"01252688\"]}");
	add("{\"term\":\"amends\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00096149\", \"13311699\"]}");
	add("{\"term\":\"amenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14325781\"]}");
	add("{\"term\":\"amenities\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13387310\"]}");
	add("{\"term\":\"amenity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04786292\"]}");
	add("{\"term\":\"amenorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14325781\"]}");
	add("{\"term\":\"amenorrhoea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14325781\"]}");
	add("{\"term\":\"ament\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11695249\"]}");
	add("{\"term\":\"amentia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05654771\"]}");
	add("{\"term\":\"amentiferae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12334091\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }