package org.swtk.commons.dict.wordnet.index.name.instance.b.e.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bean\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05547087\", \"12576812\", \"13157075\", \"07740688\"]}");
	add("{\"term\":\"beanbag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02819791\"]}");
	add("{\"term\":\"beanball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00108371\"]}");
	add("{\"term\":\"beaner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00108371\"]}");
	add("{\"term\":\"beanfeast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08271116\"]}");
	add("{\"term\":\"beanie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02819903\"]}");
	add("{\"term\":\"beano\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00505671\"]}");
	add("{\"term\":\"beanstalk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13150697\"]}");
	add("{\"term\":\"beantown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09118343\"]}");
	add("{\"term\":\"beany\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02819903\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }