package org.swtk.commons.dict.wordnet.index.name.instance.p.y.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePYRE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pyre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07980108\"]}");
	add("{\"term\":\"pyrectic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14608682\"]}");
	add("{\"term\":\"pyrene\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13157640\", \"14983076\"]}");
	add("{\"term\":\"pyrenees\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09424349\"]}");
	add("{\"term\":\"pyrenomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13048830\"]}");
	add("{\"term\":\"pyrethrum\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"12026338\", \"12042523\", \"12042851\", \"12043188\"]}");
	add("{\"term\":\"pyrex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15024181\"]}");
	add("{\"term\":\"pyrexia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14388761\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }