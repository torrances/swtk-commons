package org.swtk.commons.dict.wiktionary.generated.d.e.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDEU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("deuces", "{\"term\":\"deuces\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A pair of tw\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deuterium", "{\"term\":\"deuterium\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Coined by :w:Harold Urey|Harold Urey, an American chemist, from Ancient greek (to 1453) \u0027δεύτερος\u0027 (second) + -ium.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An isotope of hydrogen formed of one proton and one neutron in each atom\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Heavy water is “heavy” because it contains \u0027\u0027deuterium\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An atom of this isotope\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"There were about 80 \u0027\u0027deuteriums\u0027\u0027 for every million protiums, and virtually no tritium\", \"priority\":4}]}, \"synonyms\":{}}");

	add("deuterobenzene", "{\"term\":\"deuterobenzene\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|deutero|benzene|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of benzene in which one or more hydrogen atoms has been replaced by deuterium\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deuterochloroform", "{\"term\":\"deuterochloroform\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|deutero|chloroform|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A deuterated form of chloroform that is used as a solvent in NMR spectroscopy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deuteronomy", "{\"term\":\"deuteronomy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From the name which the book bears in the Septuagint (Ancient greek (to 1453) \u0027δευτερονόμιον\u0027 and in the Vulgate Latin \u0027deuteronomium\u0027 . This is based upon the erroneous Septuagint rendering of \u0027משנה התורה הזאת\u0027 (xvii. 18), which grammatically can mean only \u0026quot;a repetition [that is, a copy] of this law,\u0026quot; but which is rendered by the Septuagint \u0027τὸ Δευτερουόμιου τοῦτο\u0027, as though the expression meant \u0026quot;this repetition of the law.\u0026quot;{{book of the Bible|Book of Deuteronomy}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fifth of the Books of Moses in the Old Testament of the Bible, the fifth book in the Torah\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deuterotoky", "{\"term\":\"deuterotoky\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The production of both male and female offspring by parthenogenesis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("deutoxide", "{\"term\":\"deutoxide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|deuto|oxide|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A compound containing in the molecule two atoms of oxygen united with some other element or radical; a dioxide or binoxide\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }