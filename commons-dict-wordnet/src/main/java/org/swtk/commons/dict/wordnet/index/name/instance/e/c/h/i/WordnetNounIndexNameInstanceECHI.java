package org.swtk.commons.dict.wordnet.index.name.instance.e.c.h.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECHI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"echidna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01875042\", \"01875413\"]}");
	add("{\"term\":\"echidnophaga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02190411\"]}");
	add("{\"term\":\"echinacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11982577\"]}");
	add("{\"term\":\"echinocactus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11866026\"]}");
	add("{\"term\":\"echinocereus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11866556\"]}");
	add("{\"term\":\"echinochloa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12138024\"]}");
	add("{\"term\":\"echinococcosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14476880\"]}");
	add("{\"term\":\"echinococcus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01930569\"]}");
	add("{\"term\":\"echinoderm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02319359\"]}");
	add("{\"term\":\"echinodermata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02319044\"]}");
	add("{\"term\":\"echinoidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02321567\"]}");
	add("{\"term\":\"echinops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11982969\"]}");
	add("{\"term\":\"echinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03268551\"]}");
	add("{\"term\":\"echium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12840320\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }