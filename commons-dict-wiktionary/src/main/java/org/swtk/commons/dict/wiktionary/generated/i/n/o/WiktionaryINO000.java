package org.swtk.commons.dict.wiktionary.generated.i.n.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryINO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("inox", "{\"term\":\"inox\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"French\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"stainless stee\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"inox\u0027\u0027 steel\", \"priority\":2}]}, \"synonyms\":{}}");

	add("inoculation", "{\"term\":\"inoculation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|inoculātio}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The introduction of an antigenic substance or vaccine into the body to produce immunity to a specific disease\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The introduction of a microorganism into a culture medium\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An inoculum, what is inoculated\", \"priority\":3}]}, \"synonyms\":{}}");

	add("inoffensiveness", "{\"term\":\"inoffensiveness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|inoffensive|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the state or condition of being inoffensive\", \"priority\":1}]}, \"synonyms\":{}}");

	add("inokosterone", "{\"term\":\"inokosterone\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular phytoecdysone isolated from \u0027Achyranthes fauriei\", \"priority\":1}]}, \"synonyms\":{}}");

	add("inoperancy", "{\"term\":\"inoperancy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|in|operant|ancy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being inoperant or inoperative, of lacking the power to be effective or effectual.\u0026lt;!-- \u0027Inoperant\u0027 seems a rare synonym for \u0027Inoperative\u0027 --\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1935:\u0027\u0027 T.S. Eliot, \u0027Four Quartets\u0027, \u0026quot;Burnt Norton\u0026quot\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Inoperancy of the world of spirit\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The inoperancy of the legal system for such issues\", \"priority\":4}]}, \"synonyms\":{}}");

	add("inosculate", "{\"term\":\"inosculate\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the act of inosculating\", \"priority\":1}]}, \"synonyms\":{}}");

	add("inotropy", "{\"term\":\"inotropy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the force of muscle contractio\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }