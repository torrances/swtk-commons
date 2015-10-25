package org.swtk.commons.dict.wiktionary.generated.o.x.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOXI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oxia", "{\"term\":\"oxia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From the Ancient greek (to 1453) \u0027ὀξεῖα\u0027 an elliptical use for \u0027\u0027 (ἡ ὀξεῖᾰ προσῳδῐ́ᾱ) — {{lang|grc|. Ancient Greek|ἡ}} (\u0027hē\u0027, the nominative feminine singular form of {{lang|grc|. Ancient Greek|ὁ}}, \u0027ho\u0027, “the”, the {{l/en|definite article}}) + {{lang|grc|ὀξεῖ. Ancient Greek|ὀξεῖᾰ}} (\u0027okseia\u0027, the nominative feminine singular form of {{lang|grc|ὀξύ. Ancient Greek|ὀξῠ́ς}}, \u0027oksus\u0027, “sharp”, of sound “shrill”, of tones “high-pitched”) + {{lang|grc|προσῳδί. Ancient Greek|προσῳδῐ́ᾱ}} (\u0027prosōdiā\u0027, “variation in pitch of the speaking voice”, “pronunciation of a syllable on a certain pitch”, “a mark [\u0027i.e.\u0027, a {{l/en|diacritic}}] indicating normally unwritten differences of pronunciation, \u0027viz.\u0027 vowel quantity, breathing, and pitch”).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An w:Pitch pitch-marking : ⟨\u0026amp;nbsp;\u0027\u0027\u0027\u0027\u0026amp;nbsp;⟩; written atop , it high pitch on short vowels, and rising pitch on long vowels and\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oxide", "{\"term\":\"oxide\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"Archaic French \u0027oxide\u0027 (now \u0027oxyde\u0027 , from a blend of \u0027oxygène\u0027 and \u0027acide\u0027 coined by G. de Morveau and A. Lavoisier. \u0026lt;ref\u0026gt;http://dictionary.reference.com/browse/oxide\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A binary chemical compound of oxygen with another chemical element\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oxidane", "{\"term\":\"oxidane\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A IUPAC-compliant name for water, H\u0026lt;sub\u0026gt;2\u0026lt;/sub\u0026gt;O\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oxidation", "{\"term\":\"oxidation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027oxidation\u0027 {wikipedia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The combination of a substance with oxygen\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A reaction in which the atoms of an element lose electrons and the oxidation state of the element increases\", \"priority\":2}]}, \"synonyms\":{}}");

	add("oxidator", "{\"term\":\"oxidator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|oxidate|or|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An oxidizer\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A device for causing a current of air to impinge on the flame of the Argand lamp\", \"priority\":2}]}, \"synonyms\":{}}");

	add("oxidization", "{\"term\":\"oxidization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"oxidation\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oximetry", "{\"term\":\"oximetry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The measurement of the oxygen level in arterial blood\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }