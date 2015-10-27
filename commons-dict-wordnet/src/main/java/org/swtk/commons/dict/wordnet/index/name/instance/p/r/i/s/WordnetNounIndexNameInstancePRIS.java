package org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"priscoan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15154524\"]}");
	add("{\"term\":\"prism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04011716\", \"13907168\"]}");
	add("{\"term\":\"prismatoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13940907\"]}");
	add("{\"term\":\"prismoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13941128\"]}");
	add("{\"term\":\"prison\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13960317\", \"04012006\"]}");
	add("{\"term\":\"prisonbreak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00060809\"]}");
	add("{\"term\":\"prisoner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10495671\"]}");
	add("{\"term\":\"pristidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01499585\"]}");
	add("{\"term\":\"pristis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01499919\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }