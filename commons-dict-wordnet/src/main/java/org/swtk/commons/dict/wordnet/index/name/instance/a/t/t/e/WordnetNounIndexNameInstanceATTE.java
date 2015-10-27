package org.swtk.commons.dict.wordnet.index.name.instance.a.t.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATTE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"attempt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00775311\", \"00787849\"]}");
	add("{\"term\":\"attempter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10748650\"]}");
	add("{\"term\":\"attendance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08201981\", \"15310217\", \"01235962\"]}");
	add("{\"term\":\"attendant\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07299259\", \"09631032\", \"09841233\"]}");
	add("{\"term\":\"attendee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09631032\"]}");
	add("{\"term\":\"attender\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09631032\", \"09841233\", \"10185041\"]}");
	add("{\"term\":\"attending\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01235962\", \"05710222\"]}");
	add("{\"term\":\"attention\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05089997\", \"05658424\", \"01231134\", \"05862201\", \"00656128\", \"05710222\"]}");
	add("{\"term\":\"attentiveness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04670308\", \"04670561\", \"05710673\"]}");
	add("{\"term\":\"attenuation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05048866\", \"07442134\"]}");
	add("{\"term\":\"attenuator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02758680\"]}");
	add("{\"term\":\"attestant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09842042\", \"10805946\"]}");
	add("{\"term\":\"attestation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06662660\", \"06749154\"]}");
	add("{\"term\":\"attestator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10805946\"]}");
	add("{\"term\":\"attester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09842042\"]}");
	add("{\"term\":\"attestor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10805946\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }