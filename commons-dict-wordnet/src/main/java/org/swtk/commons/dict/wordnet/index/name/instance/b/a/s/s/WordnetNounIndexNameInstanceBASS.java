package org.swtk.commons.dict.wordnet.index.name.instance.b.a.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBASS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bass\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02568204\", \"02806515\", \"06885404\", \"07793488\", \"07793921\", \"09861916\", \"07045779\", \"04994045\"]}");
	add("{\"term\":\"bassariscidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02511089\"]}");
	add("{\"term\":\"bassariscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02511246\"]}");
	add("{\"term\":\"bassarisk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02511373\"]}");
	add("{\"term\":\"basset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02090890\"]}");
	add("{\"term\":\"basseterre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09010438\"]}");
	add("{\"term\":\"bassia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11852199\"]}");
	add("{\"term\":\"bassine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12606728\"]}");
	add("{\"term\":\"bassinet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02807681\", \"02807580\"]}");
	add("{\"term\":\"bassist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09862017\"]}");
	add("{\"term\":\"basso\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06885404\", \"09861916\"]}");
	add("{\"term\":\"bassoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02807776\"]}");
	add("{\"term\":\"bassoonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09862104\"]}");
	add("{\"term\":\"basswood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12223453\", \"12223848\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }