package org.swtk.commons.dict.wordnet.index.name.instance.s.u.c.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUCC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"succade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07616077\"]}");
	add("{\"term\":\"succedaneum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05704906\"]}");
	add("{\"term\":\"succeeder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09782244\"]}");
	add("{\"term\":\"success\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09782244\", \"14498478\", \"00064472\", \"07333703\"]}");
	add("{\"term\":\"successfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14497636\"]}");
	add("{\"term\":\"succession\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00083574\", \"13584065\", \"01012400\", \"08476919\", \"05051973\"]}");
	add("{\"term\":\"successiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05051973\"]}");
	add("{\"term\":\"successor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10691052\", \"05704768\", \"10691175\"]}");
	add("{\"term\":\"succinctness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07103216\"]}");
	add("{\"term\":\"succinylcholine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04356604\"]}");
	add("{\"term\":\"succor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01211710\"]}");
	add("{\"term\":\"succorer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10691337\"]}");
	add("{\"term\":\"succory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11973507\"]}");
	add("{\"term\":\"succos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15186919\"]}");
	add("{\"term\":\"succotash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07895048\"]}");
	add("{\"term\":\"succoth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15186919\"]}");
	add("{\"term\":\"succour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01211710\"]}");
	add("{\"term\":\"succourer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10691337\"]}");
	add("{\"term\":\"succuba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09566150\"]}");
	add("{\"term\":\"succubus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09566150\"]}");
	add("{\"term\":\"succulence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05003380\"]}");
	add("{\"term\":\"succulency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05003380\"]}");
	add("{\"term\":\"succulent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13104944\"]}");
	add("{\"term\":\"succus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05405952\"]}");
	add("{\"term\":\"succussion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00878055\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }