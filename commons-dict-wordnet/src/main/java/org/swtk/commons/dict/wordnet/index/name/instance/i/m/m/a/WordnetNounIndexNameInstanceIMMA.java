package org.swtk.commons.dict.wordnet.index.name.instance.i.m.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIMMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"immaculateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14520147\"]}");
	add("{\"term\":\"immanence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13981260\"]}");
	add("{\"term\":\"immanency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13981260\"]}");
	add("{\"term\":\"immateriality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04768772\", \"13818428\"]}");
	add("{\"term\":\"immatureness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14449378\"]}");
	add("{\"term\":\"immaturity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14449378\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }