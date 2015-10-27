package org.swtk.commons.dict.wordnet.index.name.instance.p.l.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00597196\", \"07767427\", \"12658979\"]}");
	add("{\"term\":\"plumage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01898672\"]}");
	add("{\"term\":\"plumb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03975060\"]}");
	add("{\"term\":\"plumbaginaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12118444\"]}");
	add("{\"term\":\"plumbaginales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12118263\"]}");
	add("{\"term\":\"plumbago\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12118920\", \"14820745\"]}");
	add("{\"term\":\"plumber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10462606\"]}");
	add("{\"term\":\"plumbery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00610937\"]}");
	add("{\"term\":\"plumbing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01001031\", \"00610937\", \"03975399\"]}");
	add("{\"term\":\"plumbism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14093377\"]}");
	add("{\"term\":\"plumcot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07784566\", \"12661196\"]}");
	add("{\"term\":\"plume\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01898672\", \"03976356\", \"13923453\"]}");
	add("{\"term\":\"plumeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11794748\"]}");
	add("{\"term\":\"plumiera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11794748\"]}");
	add("{\"term\":\"plummet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03975060\"]}");
	add("{\"term\":\"plump\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07404805\"]}");
	add("{\"term\":\"plumpness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05008078\"]}");
	add("{\"term\":\"plumule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01899787\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }