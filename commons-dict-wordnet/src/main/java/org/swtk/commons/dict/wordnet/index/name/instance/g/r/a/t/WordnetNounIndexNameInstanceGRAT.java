package org.swtk.commons.dict.wordnet.index.name.instance.g.r.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGRAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03459651\", \"07398844\", \"03459480\"]}");
	add("{\"term\":\"gratefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07519768\"]}");
	add("{\"term\":\"grater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03459829\"]}");
	add("{\"term\":\"graticule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04089998\"]}");
	add("{\"term\":\"gratification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01074704\", \"14010164\"]}");
	add("{\"term\":\"grating\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03199222\", \"03459480\", \"03459651\"]}");
	add("{\"term\":\"gratitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07519582\"]}");
	add("{\"term\":\"gratuity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13289043\", \"13319724\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }