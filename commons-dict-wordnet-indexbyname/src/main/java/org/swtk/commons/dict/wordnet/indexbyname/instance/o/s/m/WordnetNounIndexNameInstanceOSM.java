package org.swtk.commons.dict.wordnet.indexbyname.instance.o.s.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOSM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"osmanli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09754545\"]}");
	add("{\"term\":\"osmanthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12329920\"]}");
	add("{\"term\":\"osmeridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02542886\"]}");
	add("{\"term\":\"osmerus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02543268\"]}");
	add("{\"term\":\"osmiridium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14713139\"]}");
	add("{\"term\":\"osmitrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03723595\"]}");
	add("{\"term\":\"osmium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14672085\"]}");
	add("{\"term\":\"osmoreceptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05474227\"]}");
	add("{\"term\":\"osmosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13549303\"]}");
	add("{\"term\":\"osmund\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12973966\"]}");
	add("{\"term\":\"osmundaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12973612\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }