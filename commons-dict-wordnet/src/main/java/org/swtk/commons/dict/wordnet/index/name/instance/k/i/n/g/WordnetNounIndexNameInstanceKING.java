package org.swtk.commons.dict.wordnet.index.name.instance.k.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"king\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"03623310\", \"03623428\", \"03623548\", \"11125044\", \"11125288\", \"11125453\", \"14459136\", \"09859605\", \"10254721\", \"10251212\"]}");
	add("{\"term\":\"kingbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01550942\"]}");
	add("{\"term\":\"kingbolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03623755\"]}");
	add("{\"term\":\"kingcup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11740822\", \"11748568\"]}");
	add("{\"term\":\"kingdom\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"07956688\", \"07956792\", \"08422560\", \"08575692\", \"08608825\", \"14538407\"]}");
	add("{\"term\":\"kingfish\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02581934\", \"02600238\", \"02601203\", \"02628895\", \"07800786\"]}");
	add("{\"term\":\"kingfisher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01830044\"]}");
	add("{\"term\":\"kinglet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01566387\"]}");
	add("{\"term\":\"kingmaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10252945\", \"11395082\"]}");
	add("{\"term\":\"kingpin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03509437\", \"03623755\", \"10254839\"]}");
	add("{\"term\":\"kingship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14456467\"]}");
	add("{\"term\":\"kingsnake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01737059\"]}");
	add("{\"term\":\"kingston\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08772071\", \"08846845\", \"09147398\"]}");
	add("{\"term\":\"kingstown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09011926\"]}");
	add("{\"term\":\"kingwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12543646\", \"12543824\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }