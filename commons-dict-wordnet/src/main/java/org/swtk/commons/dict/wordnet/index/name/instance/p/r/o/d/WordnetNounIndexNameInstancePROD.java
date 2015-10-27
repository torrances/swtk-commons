package org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePROD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"prod\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04014040\", \"07267046\"]}");
	add("{\"term\":\"prodding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07267046\"]}");
	add("{\"term\":\"prodigal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10499146\"]}");
	add("{\"term\":\"prodigality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00744939\", \"04902002\"]}");
	add("{\"term\":\"prodigy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05947962\", \"07301073\", \"10499368\"]}");
	add("{\"term\":\"prodroma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14327304\"]}");
	add("{\"term\":\"prodrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14327304\"]}");
	add("{\"term\":\"produce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07721456\"]}");
	add("{\"term\":\"producer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07343356\", \"10499603\", \"10311977\"]}");
	add("{\"term\":\"product\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"08015510\", \"11435956\", \"15022266\", \"05868214\", \"04014270\", \"03754377\"]}");
	add("{\"term\":\"production\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00915416\", \"00915536\", \"07228649\", \"13780885\", \"00523792\", \"04014270\", \"07020067\", \"00914791\"]}");
	add("{\"term\":\"productiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05155187\"]}");
	add("{\"term\":\"productivity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13846712\", \"05155187\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }