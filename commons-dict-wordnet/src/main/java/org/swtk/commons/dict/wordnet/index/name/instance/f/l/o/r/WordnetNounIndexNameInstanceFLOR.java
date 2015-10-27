package org.swtk.commons.dict.wordnet.index.name.instance.f.l.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flora\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00017402\", \"08453769\"]}");
	add("{\"term\":\"floreal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15202138\"]}");
	add("{\"term\":\"florence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09161391\", \"08830018\"]}");
	add("{\"term\":\"florentine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10117359\"]}");
	add("{\"term\":\"florescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13460743\"]}");
	add("{\"term\":\"floret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11690237\"]}");
	add("{\"term\":\"florey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10993489\"]}");
	add("{\"term\":\"floriculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00923213\"]}");
	add("{\"term\":\"florida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09094188\"]}");
	add("{\"term\":\"floridian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09761432\"]}");
	add("{\"term\":\"floridity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04707284\"]}");
	add("{\"term\":\"floridness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04707284\"]}");
	add("{\"term\":\"florilegium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06604903\"]}");
	add("{\"term\":\"florin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13701960\", \"13702251\"]}");
	add("{\"term\":\"florio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10993714\"]}");
	add("{\"term\":\"florist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03372256\", \"10117474\"]}");
	add("{\"term\":\"flory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10993865\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }