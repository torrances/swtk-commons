package org.swtk.commons.dict.wordnet.index.name.instance.m.i.l.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMILK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"milk\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07860580\", \"09377677\", \"05406377\", \"07860018\"]}");
	add("{\"term\":\"milkcap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13027391\"]}");
	add("{\"term\":\"milker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02408826\"]}");
	add("{\"term\":\"milkmaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10007754\"]}");
	add("{\"term\":\"milkman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10337542\"]}");
	add("{\"term\":\"milkshake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07939537\"]}");
	add("{\"term\":\"milksop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10622786\"]}");
	add("{\"term\":\"milkwagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03771002\"]}");
	add("{\"term\":\"milkweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12039504\", \"13254625\"]}");
	add("{\"term\":\"milkwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12725773\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }